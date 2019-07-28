package typings.typesettable.buildSrcMeasurersCacheMeasurerMod

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typings.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheMeasurer", "CacheMeasurer")
@js.native
class CacheMeasurer protected () extends CacheCharacterMeasurer {
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler) = this()
  var dimCache: js.Any = js.native
  def _measureNotFromCache(s: String): IDimensions = js.native
}

