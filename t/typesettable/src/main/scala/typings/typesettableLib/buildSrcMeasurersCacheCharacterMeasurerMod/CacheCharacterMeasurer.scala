package typings
package typesettableLib.buildSrcMeasurersCacheCharacterMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", "CacheCharacterMeasurer")
@js.native
class CacheCharacterMeasurer protected ()
  extends typesettableLib.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer {
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler) = this()
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext, useGuards: scala.Boolean) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler, useGuards: scala.Boolean) = this()
  var cache: js.Any = js.native
  def _measureCharacterNotFromCache(c: java.lang.String): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
  def reset(): scala.Unit = js.native
}

