package typings.swr.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  value :std.Partial<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<any>>> & std.Partial<swr.swr/dist/types.ProviderConfiguration> & {  provider :(cache : std.Readonly<swr.swr/dist/types.Cache<any>>): swr.swr/dist/types.Cache<any> | undefined} | undefined}> */
trait PropsWithChildrenvaluePar extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var value: js.UndefOr[PartialPublicConfiguratio] = js.undefined
}
object PropsWithChildrenvaluePar {
  
  inline def apply(): PropsWithChildrenvaluePar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildrenvaluePar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsWithChildrenvaluePar] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setValue(value: PartialPublicConfiguratio): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
