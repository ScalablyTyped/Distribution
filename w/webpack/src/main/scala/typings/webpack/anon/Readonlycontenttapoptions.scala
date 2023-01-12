package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  content :{tap (options : any | undefined, fn : any | undefined): void},   module :{tap (options : any | undefined, fn : any | undefined): void},   render :{tap (options : any | undefined, fn : any | undefined): void},   package :{tap (options : any | undefined, fn : any | undefined): void},   hash :{tap (options : any | undefined, fn : any | undefined): void}}> */
trait Readonlycontenttapoptions extends StObject {
  
  @JSName("package")
  val _package: Tap
  
  val content: Tap
  
  val hash: Tap
  
  val module: Tap
  
  val render: Tap
}
object Readonlycontenttapoptions {
  
  inline def apply(_package: Tap, content: Tap, hash: Tap, module: Tap, render: Tap): Readonlycontenttapoptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlycontenttapoptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlycontenttapoptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Tap): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Tap): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Tap): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Tap): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def set_package(value: Tap): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
