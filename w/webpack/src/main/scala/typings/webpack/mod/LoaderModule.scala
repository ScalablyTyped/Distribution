package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderModule[OptionsType, ContextAdditions] extends StObject {
  
  var default: js.UndefOr[
    (RawLoaderDefinitionFunction[OptionsType, ContextAdditions]) | (LoaderDefinitionFunction[OptionsType, ContextAdditions])
  ] = js.undefined
  
  var pitch: js.UndefOr[PitchLoaderDefinitionFunction[OptionsType, ContextAdditions]] = js.undefined
  
  var raw: js.UndefOr[`false`] = js.undefined
}
object LoaderModule {
  
  inline def apply[OptionsType, ContextAdditions](): LoaderModule[OptionsType, ContextAdditions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderModule[OptionsType, ContextAdditions]]
  }
  
  extension [Self <: LoaderModule[?, ?], OptionsType, ContextAdditions](x: Self & (LoaderModule[OptionsType, ContextAdditions])) {
    
    inline def setDefault(
      value: (RawLoaderDefinitionFunction[OptionsType, ContextAdditions]) | (LoaderDefinitionFunction[OptionsType, ContextAdditions])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setPitch(value: PitchLoaderDefinitionFunction[OptionsType, ContextAdditions]): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRaw(value: `false`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
