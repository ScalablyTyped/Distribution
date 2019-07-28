package typings.typesettable.buildSrcMeasurersMeasurerMod

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.AbstractMeasurer
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/measurer", "Measurer")
@js.native
class Measurer protected () extends AbstractMeasurer {
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  def this(ruler: IRuler, useGuards: Boolean) = this()
  var guardWidth: js.Any = js.native
  var useGuards: js.Any = js.native
  def _addGuards(text: String): String = js.native
  def _measureLine(line: String): IDimensions = js.native
  def _measureLine(line: String, forceGuards: Boolean): IDimensions = js.native
  /* private */ def getGuardWidth(): js.Any = js.native
}

