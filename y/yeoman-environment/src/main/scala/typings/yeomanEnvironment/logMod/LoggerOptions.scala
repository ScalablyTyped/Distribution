package typings.yeomanEnvironment.logMod

import typings.node.ttyMod.WriteStream
import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for creating a logger.
  */
@js.native
trait LoggerOptions[TCategories /* <: String | Double | js.Symbol */] extends js.Object {
  
  /**
    * A set of categories and assigned `chalk`-formats.
    */
  var colors: js.UndefOr[ColorMap[TCategories]] = js.native
  
  /**
    * The console to write log-messages to.
    */
  var console: js.UndefOr[Console] = js.native
  
  /**
    * The stream to write other messages to.
    */
  var stderr: js.UndefOr[WriteStream] = js.native
  
  /**
    * The stream to write other messages to.
    */
  var stdout: js.UndefOr[WriteStream] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply[TCategories /* <: String | Double | js.Symbol */](): LoggerOptions[TCategories] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions[TCategories]]
  }
  
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions[_], TCategories /* <: String | Double | js.Symbol */] (val x: Self with LoggerOptions[TCategories]) extends AnyVal {
    
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
    def setColors(value: ColorMap[TCategories]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
}
