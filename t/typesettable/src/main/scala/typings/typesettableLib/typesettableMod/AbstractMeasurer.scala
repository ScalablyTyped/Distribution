package typings
package typesettableLib.typesettableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "AbstractMeasurer")
@js.native
class AbstractMeasurer protected ()
  extends typesettableLib.buildSrcMeasurersMod.AbstractMeasurer {
  def this(ruler: typesettableLib.buildSrcContextsMod.IRulerFactoryContext) = this()
  def this(ruler: typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IRuler) = this()
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
  var HEIGHT_TEXT: java.lang.String = js.native
}

