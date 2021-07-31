package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
  
  var dry: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  var traceResolution: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object BuildOptions {
  
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  @scala.inline
  implicit class BuildOptionsMutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumeChangesOnlyAffectDirectDependencies(value: Boolean): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
    
    @scala.inline
    def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    @scala.inline
    def setTraceResolution(value: Boolean): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
