package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderChunkShaderChunkMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "NULL")
  @js.native
  val NULL: Double = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "basic_materialColor_fragment")
  @js.native
  val basicMaterialColorFragment: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "common_define")
  @js.native
  val commonDefine: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "common_fragment")
  @js.native
  val commonFragment: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "common_function")
  @js.native
  val commonFunction: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "common_vertex")
  @js.native
  val commonVertex: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "empty")
  @js.native
  val empty: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "end_basic_fragment")
  @js.native
  val endBasicFragment: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "highp_fragment")
  @js.native
  val highpFragment: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "lowp_fragment")
  @js.native
  val lowpFragment: GLSLChunk = js.native
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/chunk/ShaderChunk", "mediump_fragment")
  @js.native
  val mediumpFragment: GLSLChunk = js.native
  
  trait GLSLChunk extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var define: js.UndefOr[String] = js.undefined
    
    var funcDeclare: js.UndefOr[String] = js.undefined
    
    var funcDefine: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var varDeclare: js.UndefOr[String] = js.undefined
  }
  object GLSLChunk {
    
    inline def apply(): GLSLChunk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLSLChunk]
    }
    
    extension [Self <: GLSLChunk](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
      
      inline def setFuncDeclare(value: String): Self = StObject.set(x, "funcDeclare", value.asInstanceOf[js.Any])
      
      inline def setFuncDeclareUndefined: Self = StObject.set(x, "funcDeclare", js.undefined)
      
      inline def setFuncDefine(value: String): Self = StObject.set(x, "funcDefine", value.asInstanceOf[js.Any])
      
      inline def setFuncDefineUndefined: Self = StObject.set(x, "funcDefine", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setVarDeclare(value: String): Self = StObject.set(x, "varDeclare", value.asInstanceOf[js.Any])
      
      inline def setVarDeclareUndefined: Self = StObject.set(x, "varDeclare", js.undefined)
    }
  }
}
