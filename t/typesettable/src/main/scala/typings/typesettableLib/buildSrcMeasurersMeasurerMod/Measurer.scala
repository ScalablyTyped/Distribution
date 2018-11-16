package typings
package typesettableLib.buildSrcMeasurersMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/measurer", "Measurer")
@js.native
class Measurer protected ()
  extends typesettableLib.buildSrcMeasurersAbstractMeasurerMod.AbstractMeasurer {
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler) = this()
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext, useGuards: scala.Boolean) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler, useGuards: scala.Boolean) = this()
  var guardWidth: js.Any = js.native
  var useGuards: js.Any = js.native
  def _addGuards(text: java.lang.String): java.lang.String = js.native
  def _measureLine(line: java.lang.String): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
  def _measureLine(line: java.lang.String, forceGuards: scala.Boolean): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
  /* private */ def getGuardWidth(): js.Any = js.native
}

