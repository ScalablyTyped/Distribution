package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.anon.PostTransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/assetUrl", JSImport.Namespace)
@js.native
object assetUrlMod extends js.Object {
  def default(): PostTransformNode = js.native
  def default(userOptions: AssetURLOptions): PostTransformNode = js.native
  type AssetURLOptions = StringDictionary[String | js.Array[String]]
}

