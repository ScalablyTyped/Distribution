package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  /**
    * @param idl The WebIDL file or directory of WebIDL files
    *        to generate wrappers for.
    * @param impl The directory containing implementation files
    *        for the provided WebIDL file(s).
    */
  def addSource(idl: String, impl: String): this.type
  /**
    * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
    * in the supplied output directory.
    *
    * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
    * @return A promise that will be resolved once all files have been written,
    *         or rejected if an error was encountered.
    */
  def generate(outputDir: String): js.Promise[Unit]
}

object Transformer {
  @scala.inline
  def apply(addSource: (String, String) => Transformer, generate: String => js.Promise[Unit]): Transformer = {
    val __obj = js.Dynamic.literal(addSource = js.Any.fromFunction2(addSource), generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[Transformer]
  }
}

