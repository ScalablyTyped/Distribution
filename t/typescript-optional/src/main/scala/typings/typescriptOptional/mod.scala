package typings.typescriptOptional

import typings.typescriptOptional.distEsmTypesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typescript-optional", "EmptyOptional")
  @js.native
  open class EmptyOptional[T] ()
    extends typings.typescriptOptional.distEsmOptionalMod.EmptyOptional[T]
  
  /* note: abstract class */ @JSImport("typescript-optional", "Optional")
  @js.native
  open class Optional[T] ()
    extends typings.typescriptOptional.distEsmOptionalMod.Optional[T]
  /* static members */
  object Optional {
    
    @JSImport("typescript-optional", "Optional")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty[T](): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
    
    inline def from[T](option: Option[T]): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(option.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
    
    inline def of[T](value: T): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
    
    inline def ofNonNull[T](value: T): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNonNull")(value.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
    
    inline def ofNullable[T](): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")().asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
    inline def ofNullable[T](nullable: T): typings.typescriptOptional.distEsmOptionalMod.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")(nullable.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptOptional.distEsmOptionalMod.Optional[T]]
  }
  
  @JSImport("typescript-optional", "PresentOptional")
  @js.native
  open class PresentOptional[T] protected ()
    extends typings.typescriptOptional.distEsmOptionalMod.PresentOptional[T] {
    def this(value: T) = this()
  }
}
