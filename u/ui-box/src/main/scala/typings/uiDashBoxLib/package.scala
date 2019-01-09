package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiDashBoxLib {
  type CSSProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CSS.StandardProperties */ js.Any
  type CacheEntry = js.Array[js.Tuple2[/** key */ java.lang.String, /** value */ java.lang.String]]
  /** A prop defining which */
  type UIBoxIsProp = java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any)
  /** Placeholder type for UI box props */
  type UIBoxProp = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
