package typings.vueRuntimeCore.mod

import typings.vueShared.mod.Prettify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Note: this file is auto concatenated to the end of the bundled d.ts during
// build.
@js.native
trait _defineProps extends StObject {
  
  def apply[TypeProps](): DefineProps_[TypeProps] = js.native
  def apply[PP /* <: ComponentObjectPropsOptions[Data] */](props: PP): Prettify[ExtractPropTypes[PP]] = js.native
  def apply[PropNames /* <: String */](props: js.Array[PropNames]): Prettify[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any
  ] = js.native
}
