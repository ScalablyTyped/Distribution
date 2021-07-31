package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOptions extends StObject {
  
  def genData(el: ASTElement): String
  
  def postTransformNode(el: ASTElement): Unit
  
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement]
  
  var staticKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.undefined
  
  def transformNode(el: ASTElement): js.UndefOr[ASTElement]
}
object ModuleOptions {
  
  @scala.inline
  def apply(
    genData: ASTElement => String,
    postTransformNode: ASTElement => Unit,
    preTransformNode: ASTElement => js.UndefOr[ASTElement],
    transformNode: ASTElement => js.UndefOr[ASTElement]
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(genData = js.Any.fromFunction1(genData), postTransformNode = js.Any.fromFunction1(postTransformNode), preTransformNode = js.Any.fromFunction1(preTransformNode), transformNode = js.Any.fromFunction1(transformNode))
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenData(value: ASTElement => String): Self = StObject.set(x, "genData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostTransformNode(value: ASTElement => Unit): Self = StObject.set(x, "postTransformNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = StObject.set(x, "preTransformNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStaticKeys(value: js.Array[String]): Self = StObject.set(x, "staticKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticKeysUndefined: Self = StObject.set(x, "staticKeys", js.undefined)
    
    @scala.inline
    def setStaticKeysVarargs(value: String*): Self = StObject.set(x, "staticKeys", js.Array(value :_*))
    
    @scala.inline
    def setTransformCode(value: (/* el */ ASTElement, /* code */ String) => String): Self = StObject.set(x, "transformCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformCodeUndefined: Self = StObject.set(x, "transformCode", js.undefined)
    
    @scala.inline
    def setTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = StObject.set(x, "transformNode", js.Any.fromFunction1(value))
  }
}
