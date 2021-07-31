package typings.wonderJs

import typings.wonderJs.bufferMod.Buffer
import typings.wonderJs.ebuffertypeMod.EBufferType
import typings.wonderJs.ebufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonBufferMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/CommonBuffer", "CommonBuffer")
  @js.native
  abstract class CommonBuffer () extends Buffer {
    
    var count: Double = js.native
    
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any): Unit = js.native
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any, offset: Double): Unit = js.native
    
    var `type`: EBufferType = js.native
    
    var usage: EBufferUsage = js.native
  }
}
