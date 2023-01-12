package typings.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  userAgent :string,   videoPath :string,   testRunId :string}> */
trait Video extends StObject {
  
  val testRunId: String
  
  val userAgent: String
  
  val videoPath: String
}
object Video {
  
  inline def apply(testRunId: String, userAgent: String, videoPath: String): Video = {
    val __obj = js.Dynamic.literal(testRunId = testRunId.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], videoPath = videoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVideoPath(value: String): Self = StObject.set(x, "videoPath", value.asInstanceOf[js.Any])
  }
}
