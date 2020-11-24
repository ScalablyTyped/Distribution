package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an uncaught JavaScript exception occurs.
  */
@js.native
trait AppUncaughtExceptionEvent extends AppBaseEvent {
  
  /**
    * The column offset on the line where the error occured.
    */
  var column: Double = js.native
  
  /**
    * The java stack trace of the exception.
    * @deprecated Use `nativeStack` property for cross-platform parity.
    */
  var javaStack: String = js.native
  
  /**
    * The javascript stack trace of the exception.
    * @deprecated Use `stack` property for cross-platform parity.
    */
  var jsStack: String = js.native
  
  /**
    * The line where the error occurred.
    */
  var line: Double = js.native
  
  /**
    * The offset on the line where the error occurred.
    * @deprecated Use `column` property for cross-platform parity.
    */
  var lineOffset: Double = js.native
  
  /**
    * The line source reference.
    */
  var lineSource: String = js.native
  
  /**
    * The error message.
    */
  var message: String = js.native
  
  /**
    * The native platform stack trace of the exception.
    */
  var nativeStack: String = js.native
  
  /**
    * A unique identification for the source file.
    */
  var sourceId: Double = js.native
  
  /**
    * The name of the source file.
    */
  var sourceName: String = js.native
  
  /**
    * The URL to the source file.
    */
  var sourceURL: String = js.native
  
  /**
    * The javascript stack trace of the exception.
    */
  var stack: String = js.native
  
  /**
    * The title for the error.
    */
  var title: String = js.native
  
  /**
    * The type of error.
    */
  var `type`: String = js.native
}
object AppUncaughtExceptionEvent {
  
  @scala.inline
  def apply(
    column: Double,
    javaStack: String,
    jsStack: String,
    line: Double,
    lineOffset: Double,
    lineSource: String,
    message: String,
    nativeStack: String,
    source: App,
    sourceId: Double,
    sourceName: String,
    sourceURL: String,
    stack: String,
    title: String,
    `type`: String
  ): AppUncaughtExceptionEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], javaStack = javaStack.asInstanceOf[js.Any], jsStack = jsStack.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineOffset = lineOffset.asInstanceOf[js.Any], lineSource = lineSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nativeStack = nativeStack.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUncaughtExceptionEvent]
  }
  
  @scala.inline
  implicit class AppUncaughtExceptionEventOps[Self <: AppUncaughtExceptionEvent] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaStack(value: String): Self = this.set("javaStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsStack(value: String): Self = this.set("jsStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineOffset(value: Double): Self = this.set("lineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSource(value: String): Self = this.set("lineSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeStack(value: String): Self = this.set("nativeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: Double): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
