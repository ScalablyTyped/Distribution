package typings.wonderJs

import typings.wonderJs.distEs2015RendererBufferBufferMod.Buffer
import typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType
import typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererBufferCommonBufferMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/buffer/CommonBuffer", "CommonBuffer")
  @js.native
  open class CommonBuffer () extends Buffer {
    
    var count: Double = js.native
    
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: Any): Unit = js.native
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: Any, offset: Double): Unit = js.native
    
    var `type`: EBufferType = js.native
    
    var usage: EBufferUsage = js.native
  }
}
