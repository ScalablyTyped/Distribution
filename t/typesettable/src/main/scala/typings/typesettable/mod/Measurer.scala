package typings.typesettable.mod

import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable", "Measurer")
@js.native
class Measurer protected ()
  extends typings.typesettable.measurersMod.Measurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler, useGuards: Boolean) = this()
  def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
}
