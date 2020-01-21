package typings.typesettable.mod

import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "CacheCharacterMeasurer")
@js.native
class CacheCharacterMeasurer protected ()
  extends typings.typesettable.measurersMod.CacheCharacterMeasurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler, useGuards: Boolean) = this()
  def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
}

