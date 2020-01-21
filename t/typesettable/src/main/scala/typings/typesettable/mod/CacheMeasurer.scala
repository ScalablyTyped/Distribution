package typings.typesettable.mod

import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "CacheMeasurer")
@js.native
class CacheMeasurer protected ()
  extends typings.typesettable.measurersMod.CacheMeasurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
}

