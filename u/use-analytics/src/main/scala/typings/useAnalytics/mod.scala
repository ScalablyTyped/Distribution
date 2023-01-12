package typings.useAnalytics

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.Omit
import typings.useAnalytics.useAnalyticsStrings.analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("use-analytics", "AnalyticsConsumer")
  @js.native
  val AnalyticsConsumer: Consumer[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
  ] = js.native
  
  @JSImport("use-analytics", "AnalyticsContext")
  @js.native
  val AnalyticsContext: Context[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
  ] = js.native
  
  @JSImport("use-analytics", "AnalyticsProvider")
  @js.native
  val AnalyticsProvider: ComponentType[AnalyticsProviderProps] = js.native
  
  inline def useAnalytics(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnalytics")().asInstanceOf[Any]
  
  inline def useIdentify(): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['identify'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useIdentify")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['identify'] */ js.Any]
  
  inline def usePage(): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['page'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePage")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['page'] */ js.Any]
  
  inline def useTrack(): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['track'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrack")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance * / any['track'] */ js.Any]
  
  inline def withAnalytics[T /* <: WithAnalyticsProps */](Component: ComponentType[T]): ComponentType[Omit[T, analytics]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAnalytics")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[T, analytics]]]
  
  trait AnalyticsProviderProps extends StObject {
    
    var children: ReactNode
    
    var instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
  }
  object AnalyticsProviderProps {
    
    inline def apply(
      instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
    ): AnalyticsProviderProps = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInstance(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
      ): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithAnalyticsProps extends StObject {
    
    var analytics: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
  }
  object WithAnalyticsProps {
    
    inline def apply(
      analytics: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
    ): WithAnalyticsProps = {
      val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithAnalyticsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithAnalyticsProps] (val x: Self) extends AnyVal {
      
      inline def setAnalytics(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnalyticsInstance */ Any
      ): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    }
  }
}
