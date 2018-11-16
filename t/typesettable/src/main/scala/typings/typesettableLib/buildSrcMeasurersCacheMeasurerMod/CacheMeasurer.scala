package typings
package typesettableLib.buildSrcMeasurersCacheMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheMeasurer", "CacheMeasurer")
@js.native
class CacheMeasurer protected ()
  extends typesettableLib.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer {
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler) = this()
  var dimCache: js.Any = js.native
  def _measureNotFromCache(s: java.lang.String): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
}

