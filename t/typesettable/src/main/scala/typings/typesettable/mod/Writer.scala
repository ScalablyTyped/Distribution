package typings.typesettable.mod

import typings.typesettable.KinIXAlignnumber
import typings.typesettable.KinIYAlignnumber
import typings.typesettable.contextsMod.IPenFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Writer")
@js.native
class Writer protected ()
  extends typings.typesettable.writersMod.Writer {
  def this(_measurer: typings.typesettable.measurersMod.AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
  def this(
    _measurer: typings.typesettable.measurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_],
    _wrapper: typings.typesettable.wrappersMod.Wrapper
  ) = this()
}

/* static members */
@JSImport("typesettable", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: KinIXAlignnumber = js.native
  var YOffsetFactor: KinIYAlignnumber = js.native
}

