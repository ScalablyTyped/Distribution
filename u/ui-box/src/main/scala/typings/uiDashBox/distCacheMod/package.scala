package typings.uiDashBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCacheMod {
  import typings.uiDashBox.distTypesEnhancersMod.BoxPropValue

  type CacheEntry = js.Tuple2[/** key */ String, /** value */ String]
  type CacheValue = BoxPropValue
}
