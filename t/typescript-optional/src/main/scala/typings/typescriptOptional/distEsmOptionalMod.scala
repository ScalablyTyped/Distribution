package typings.typescriptOptional

import typings.std.NonNullable
import typings.typescriptOptional.distEsmTypesMod.Cases
import typings.typescriptOptional.distEsmTypesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmOptionalMod {
  
  @JSImport("typescript-optional/dist/esm/optional", "EmptyOptional")
  @js.native
  open class EmptyOptional[T] () extends Optional[T]
  
  /* note: abstract class */ @JSImport("typescript-optional/dist/esm/optional", "Optional")
  @js.native
  open class Optional[T] () extends StObject {
    
    def filter(predicate: js.Function1[/* value */ T, Boolean]): Optional[T] = js.native
    
    def flatMap[U](mapper: js.Function1[/* value */ T, Optional[U]]): Optional[U] = js.native
    
    def get(): T = js.native
    
    def ifPresent(consumer: js.Function1[/* value */ T, Unit]): Unit = js.native
    
    def ifPresentOrElse(consumer: js.Function1[/* value */ T, Unit], emptyAction: js.Function0[Unit]): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isPresent(): Boolean = js.native
    
    def map[U](mapper: js.Function1[/* value */ T, U]): Optional[NonNullable[U]] = js.native
    
    def matches[U](cases: Cases[T, U]): U = js.native
    
    def or(supplier: js.Function0[Optional[T]]): Optional[T] = js.native
    
    def orElse(another: T): T = js.native
    
    def orElseGet(supplier: js.Function0[T]): T = js.native
    
    def orElseThrow[U](errorSupplier: js.Function0[U]): T = js.native
    
    def orNull(): T | Null = js.native
    
    def orUndefined(): js.UndefOr[T] = js.native
    
    def toJSON(key: String): Any = js.native
    
    def toOption(): Option[T] = js.native
  }
  /* static members */
  object Optional {
    
    @JSImport("typescript-optional/dist/esm/optional", "Optional")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty[T](): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Optional[T]]
    
    inline def from[T](option: Option[T]): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(option.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
    
    inline def of[T](value: T): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
    
    inline def ofNonNull[T](value: T): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNonNull")(value.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
    
    inline def ofNullable[T](): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")().asInstanceOf[Optional[T]]
    inline def ofNullable[T](nullable: T): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")(nullable.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
  }
  
  @JSImport("typescript-optional/dist/esm/optional", "PresentOptional")
  @js.native
  open class PresentOptional[T] protected () extends Optional[T] {
    def this(value: T) = this()
    
    var payload: T = js.native
  }
}
