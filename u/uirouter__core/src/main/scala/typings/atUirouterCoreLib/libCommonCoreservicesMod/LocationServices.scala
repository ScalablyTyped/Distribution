package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationServices
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** See: [[UrlService.hash]] */ var hash: js.Function0[java.lang.String] | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibraryScoped(uirouter,Some(core)), TsIdentModule(Some(uirouter),List(core, lib, url)), TsIdentSimple(UrlService))),List()),Left(TsIdentSimple(hash))) */js.Any) = js.native
  /** See: [[UrlService.onChange]] */ var onChange: (js.Function1[/* callback */ js.Function, js.Function]) | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibraryScoped(uirouter,Some(core)), TsIdentModule(Some(uirouter),List(core, lib, url)), TsIdentSimple(UrlService))),List()),Left(TsIdentSimple(onChange))) */js.Any) = js.native
  /** See: [[UrlService.path]] */ var path: js.Function0[java.lang.String] | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibraryScoped(uirouter,Some(core)), TsIdentModule(Some(uirouter),List(core, lib, url)), TsIdentSimple(UrlService))),List()),Left(TsIdentSimple(path))) */js.Any) = js.native
  /** See: [[UrlService.search]] */ var search: js.Function0[org.scalablytyped.runtime.StringDictionary[_]] | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibraryScoped(uirouter,Some(core)), TsIdentModule(Some(uirouter),List(core, lib, url)), TsIdentSimple(UrlService))),List()),Left(TsIdentSimple(search))) */js.Any) = js.native
  /** See: [[UrlService.url]] */ var url: (js.Function3[
    /* newurl */ js.UndefOr[java.lang.String], 
    /* replace */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[js.Any], 
    java.lang.String
  ]) | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibraryScoped(uirouter,Some(core)), TsIdentModule(Some(uirouter),List(core, lib, url)), TsIdentSimple(UrlService))),List()),Left(TsIdentSimple(url))) */js.Any) = js.native
}

