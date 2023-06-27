package typings.swr

import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.swr.anon.PartialPropsWithChildrenv
import typings.swr.anon.PropsWithChildrenvaluePar
import typings.swr.anon.WeakValidationMapPropsWit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A hook to fetch data.
    *
    * @link https://swr.vercel.app
    * @example
    * ```jsx
    * import useSWR from 'swr'
    * function Profile() {
    *   const { data, error } = useSWR('/api/user', fetcher)
    *   if (error) return <div>failed to load</div>
    *   if (!data) return <div>loading...</div>
    *   return <div>hello {data.name}!</div>
    * }
    * ```
    */
  @JSImport("swr", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SWRHook */ Any = js.native
  
  /* Inlined react.react.FC<react.react.PropsWithChildren<{  value :std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.PublicConfiguration<any, any, swr__internal.BareFetcher<any>> * / any> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.ProviderConfiguration * / any> & {  provider :(cache : std.Readonly<swr.swr.Cache>): swr.swr.Cache | undefined} | (parentConfig : std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.PublicConfiguration<any, any, swr__internal.BareFetcher<any>> * / any> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.ProviderConfiguration * / any> & {  provider :(cache : std.Readonly<swr.swr.Cache>): swr.swr.Cache | undefined} | undefined): std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.PublicConfiguration<any, any, swr__internal.BareFetcher<any>> * / any> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify swr__internal.ProviderConfiguration * / any> & {  provider :(cache : std.Readonly<swr.swr.Cache>): swr.swr.Cache | undefined} | undefined}>> & {  defaultValue :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FullConfiguration * / any} */
  object SWRConfig {
    
    inline def apply(props: PropsWithChildrenvaluePar): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: PropsWithChildrenvaluePar, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("swr", "SWRConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swr", "SWRConfig.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPropsWithChildrenv] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialPropsWithChildrenv]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.defaultValue")
    @js.native
    def defaultValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FullConfiguration */ Any = js.native
    inline def defaultValue_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FullConfiguration */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPropsWit] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapPropsWit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def unstableSerialize(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_serialize")(key.asInstanceOf[js.Any]).asInstanceOf[String]
}
