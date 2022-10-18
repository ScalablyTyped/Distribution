package typings.sucrase

import org.scalablytyped.runtime.Shortcut
import typings.tsInterfaceChecker.distTypesMod.ITypeSuite
import typings.tsInterfaceChecker.mod.TIface
import typings.tsInterfaceChecker.mod.TUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsGenTypesMod extends Shortcut {
  
  @JSImport("sucrase/dist/types/Options-gen-types", JSImport.Default)
  @js.native
  val default: ITypeSuite = js.native
  
  @JSImport("sucrase/dist/types/Options-gen-types", "Options")
  @js.native
  val Options: TIface = js.native
  
  @JSImport("sucrase/dist/types/Options-gen-types", "SourceMapOptions")
  @js.native
  val SourceMapOptions: TIface = js.native
  
  @JSImport("sucrase/dist/types/Options-gen-types", "Transform")
  @js.native
  val Transform: TUnion = js.native
  
  type _To = ITypeSuite
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOptionsGenTypesMod.foo` */
  override def _to: ITypeSuite = default
}
