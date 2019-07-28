package typings.typesettable.typesettableMod

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "AbstractMeasurer")
@js.native
class AbstractMeasurer protected ()
  extends typings.typesettable.buildSrcMeasurersMod.AbstractMeasurer {
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler) = this()
}

/* static members */
@JSImport("typesettable", "AbstractMeasurer")
@js.native
object AbstractMeasurer extends js.Object {
  /**
    * A string representing the full ascender/descender range of your text.
    *
    * Note that this is really only applicable to western alphabets. If you are
    * using a different locale language such as arabic or chinese, you may want
    * to override this.
    */
  var HEIGHT_TEXT: String = js.native
}

