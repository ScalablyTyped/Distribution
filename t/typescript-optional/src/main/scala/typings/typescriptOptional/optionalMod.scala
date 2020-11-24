package typings.typescriptOptional

import typings.std.NonNullable
import typings.typescriptOptional.typesMod.Cases
import typings.typescriptOptional.typesMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-optional/dist/optional", JSImport.Namespace)
@js.native
object optionalMod extends js.Object {
  
  @js.native
  abstract class Optional[T] () extends js.Object {
    
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
    
    def toJSON(key: String): js.Any = js.native
    
    def toOption(): Option[T] = js.native
  }
  /* static members */
  @js.native
  object Optional extends js.Object {
    
    def empty[T](): Optional[T] = js.native
    
    def from[T](option: Option[T]): Optional[T] = js.native
    
    def of[T](value: T): Optional[T] = js.native
    
    def ofNonNull[T](value: T): Optional[T] = js.native
    
    def ofNullable[T](): Optional[T] = js.native
    def ofNullable[T](nullable: T): Optional[T] = js.native
  }
}
