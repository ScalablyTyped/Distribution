package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  renderManifest :{tap (options : any | undefined, fn : any | undefined): void},   modules :{tap (options : any | undefined, fn : any | undefined): void},   render :{tap (options : any | undefined, fn : any | undefined): void},   renderWithEntry :{tap (options : any | undefined, fn : any | undefined): void},   hash :{tap (options : any | undefined, fn : any | undefined): void},   hashForChunk :{tap (options : any | undefined, fn : any | undefined): void}}> */
trait ReadonlyrenderManifesttap extends StObject {
  
  val hash: Tap
  
  val hashForChunk: Tap
  
  val modules: Tap
  
  val render: Tap
  
  val renderManifest: Tap
  
  val renderWithEntry: Tap
}
object ReadonlyrenderManifesttap {
  
  inline def apply(hash: Tap, hashForChunk: Tap, modules: Tap, render: Tap, renderManifest: Tap, renderWithEntry: Tap): ReadonlyrenderManifesttap = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], hashForChunk = hashForChunk.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderManifest = renderManifest.asInstanceOf[js.Any], renderWithEntry = renderWithEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyrenderManifesttap]
  }
  
  extension [Self <: ReadonlyrenderManifesttap](x: Self) {
    
    inline def setHash(value: Tap): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashForChunk(value: Tap): Self = StObject.set(x, "hashForChunk", value.asInstanceOf[js.Any])
    
    inline def setModules(value: Tap): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Tap): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderManifest(value: Tap): Self = StObject.set(x, "renderManifest", value.asInstanceOf[js.Any])
    
    inline def setRenderWithEntry(value: Tap): Self = StObject.set(x, "renderWithEntry", value.asInstanceOf[js.Any])
  }
}
