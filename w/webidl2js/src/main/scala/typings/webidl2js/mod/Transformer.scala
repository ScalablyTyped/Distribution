package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer extends js.Object {
  
  /**
    * @param idl The WebIDL file or directory of WebIDL files
    *        to generate wrappers for.
    * @param impl The directory containing implementation files
    *        for the provided WebIDL file(s).
    */
  def addSource(idl: String, impl: String): this.type = js.native
  
  /**
    * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
    * in the supplied output directory.
    *
    * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
    * @return A promise that will be resolved once all files have been written,
    *         or rejected if an error was encountered.
    */
  def generate(outputDir: String): js.Promise[Unit] = js.native
}
object Transformer {
  
  @scala.inline
  def apply(addSource: (String, String) => Transformer, generate: String => js.Promise[Unit]): Transformer = {
    val __obj = js.Dynamic.literal(addSource = js.Any.fromFunction2(addSource), generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[Transformer]
  }
  
  @scala.inline
  implicit class TransformerOps[Self <: Transformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddSource(value: (String, String) => Transformer): Self = this.set("addSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGenerate(value: String => js.Promise[Unit]): Self = this.set("generate", js.Any.fromFunction1(value))
  }
}
