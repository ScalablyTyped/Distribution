package typings.yeomanGenerator.mod

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.memFsEditor.mod.CopyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides settings for rendering a template.
  */
@js.native
trait TemplateRenderOptions[T /* <: Generator[_] */] extends js.Object {
  
  /**
    * The `mem-fs-editor` copy-options.
    */
  var copyOptions: js.UndefOr[CopyOptions] = js.native
  
  /**
    * The destination, absolute or relative to `destinationPath()`.
    */
  var destination: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The template file, absolute or relative to `templatePath()`.
    */
  var source: String | js.Array[String] = js.native
  
  /**
    * The `ejs` options.
    */
  var templateOptions: js.UndefOr[Options] = js.native
  
  /**
    * A method for determining whether the template should be rendered.
    */
  var when: js.UndefOr[js.Function2[/* templateData */ Data, /* generator */ T, Boolean]] = js.native
}
object TemplateRenderOptions {
  
  @scala.inline
  def apply[T /* <: Generator[_] */](source: String | js.Array[String]): TemplateRenderOptions[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateRenderOptions[T]]
  }
  
  @scala.inline
  implicit class TemplateRenderOptionsOps[Self <: TemplateRenderOptions[_], T /* <: Generator[_] */] (val x: Self with TemplateRenderOptions[T]) extends AnyVal {
    
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
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String | js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyOptions(value: CopyOptions): Self = this.set("copyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyOptions: Self = this.set("copyOptions", js.undefined)
    
    @scala.inline
    def setDestinationVarargs(value: String*): Self = this.set("destination", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: String | js.Array[String]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setTemplateOptions(value: Options): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateOptions: Self = this.set("templateOptions", js.undefined)
    
    @scala.inline
    def setWhen(value: (/* templateData */ Data, /* generator */ T) => Boolean): Self = this.set("when", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
