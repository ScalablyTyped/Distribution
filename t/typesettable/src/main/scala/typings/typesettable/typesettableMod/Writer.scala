package typings.typesettable.typesettableMod

import typings.typesettable.buildSrcContextsMod.IPenFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Writer")
@js.native
class Writer protected ()
  extends typings.typesettable.buildSrcWritersMod.Writer {
  def this(
    _measurer: typings.typesettable.buildSrcMeasurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_]
  ) = this()
  def this(
    _measurer: typings.typesettable.buildSrcMeasurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_],
    _wrapper: typings.typesettable.buildSrcWrappersMod.Wrapper
  ) = this()
}

/* static members */
@JSImport("typesettable", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number}
    */ typings.typesettable.typesettableStrings.Writer with js.Any = js.native
  var YOffsetFactor: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number}
    */ typings.typesettable.typesettableStrings.Writer with js.Any = js.native
}

