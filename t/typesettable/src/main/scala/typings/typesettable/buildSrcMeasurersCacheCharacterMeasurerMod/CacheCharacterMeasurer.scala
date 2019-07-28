package typings.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typings.typesettable.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", "CacheCharacterMeasurer")
@js.native
class CacheCharacterMeasurer protected () extends CharacterMeasurer {
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  def this(ruler: IRuler, useGuards: Boolean) = this()
  var cache: js.Any = js.native
  def _measureCharacterNotFromCache(c: String): IDimensions = js.native
  def reset(): Unit = js.native
}

