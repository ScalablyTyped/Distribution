package typings.typesettable.abstractMeasurerMod

import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/abstractMeasurer", "AbstractMeasurer")
@js.native
class AbstractMeasurer protected () extends js.Object {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
  var ruler: js.Any = js.native
  def measure(): IDimensions = js.native
  def measure(text: String): IDimensions = js.native
}

/* static members */
@JSImport("typesettable/build/src/measurers/abstractMeasurer", "AbstractMeasurer")
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

