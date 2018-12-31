package typings
package typesettableLib.buildSrcWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/writers/writer", "Writer")
@js.native
class Writer protected () extends js.Object {
  def this(_measurer: typesettableLib.buildSrcMeasurersMod.AbstractMeasurer, _penFactory: typesettableLib.buildSrcContextsMod.IPenFactoryContext[_]) = this()
  def this(_measurer: typesettableLib.buildSrcMeasurersMod.AbstractMeasurer, _penFactory: typesettableLib.buildSrcContextsMod.IPenFactoryContext[_], _wrapper: typesettableLib.buildSrcWrappersMod.Wrapper) = this()
  var _measurer: js.Any = js.native
  var _penFactory: js.Any = js.native
  var _wrapper: js.Any = js.native
  def measurer(newMeasurer: typesettableLib.buildSrcMeasurersMod.AbstractMeasurer): Writer = js.native
  def penFactory(newPenFactory: typesettableLib.buildSrcContextsMod.IPenFactoryContext[_]): Writer = js.native
  def wrapper(newWrapper: typesettableLib.buildSrcWrappersMod.Wrapper): Writer = js.native
  /**
    * Writes the text into the container. If no container is specified, the pen's
    * default container will be used.
    */
  def write[T](text: java.lang.String, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def write[T](text: java.lang.String, width: scala.Double, height: scala.Double, options: IWriteOptions): scala.Unit = js.native
  def write[T](
    text: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    options: IWriteOptions,
    container: T
  ): scala.Unit = js.native
  /* private */ def writeLines(
    lines: js.Any,
    linePen: js.Any,
    width: js.Any,
    lineHeight: js.Any,
    shearShift: js.Any,
    xAlign: js.Any
  ): js.Any = js.native
}

@JSImport("typesettable/build/src/writers/writer", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: typesettableLib.typesettableLibStrings.Writer with js.Any = js.native
  var YOffsetFactor: typesettableLib.typesettableLibStrings.Writer with js.Any = js.native
}

