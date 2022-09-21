package typings.styledComponents

import typings.styledComponents.distTypesMod.ExtensibleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixinDeepMod {
  
  @JSImport("styled-components/native/dist/dist/utils/mixinDeep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Unit, sources: Any*): ExtensibleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ExtensibleObject]
  inline def default(target: ExtensibleObject, sources: Any*): ExtensibleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ExtensibleObject]
}
