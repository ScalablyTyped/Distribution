package typings.typesettable

import typings.typesettable.buildSrcContextsMod.IPenFactoryContext
import typings.typesettable.buildSrcMeasurersMod.AbstractMeasurer
import typings.typesettable.buildSrcWrappersMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/writers", JSImport.Namespace)
@js.native
object buildSrcWritersMod extends js.Object {
  @js.native
  class Writer protected ()
    extends typings.typesettable.buildSrcWritersWriterMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  }
  
  /* static members */
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
  
}

