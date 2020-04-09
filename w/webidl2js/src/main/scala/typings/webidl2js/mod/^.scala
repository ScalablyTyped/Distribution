package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webidl2js", JSImport.Namespace)
@js.native
class ^ () extends Transformer {
  def this(opts: Options) = this()
  /**
  	 * @param idl The WebIDL file or directory of WebIDL files
  	 *        to generate wrappers for.
  	 * @param impl The directory containing implementation files
  	 *        for the provided WebIDL file(s).
  	 */
  /* CompleteClass */
  override def addSource(idl: String, impl: String): this.type = js.native
  /**
  	 * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
  	 * in the supplied output directory.
  	 *
  	 * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
  	 * @return A promise that will be resolved once all files have been written,
  	 *         or rejected if an error was encountered.
  	 */
  /* CompleteClass */
  override def generate(outputDir: String): js.Promise[Unit] = js.native
}

