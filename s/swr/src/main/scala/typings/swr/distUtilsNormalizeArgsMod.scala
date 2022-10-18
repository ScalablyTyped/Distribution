package typings.swr

import typings.std.Partial
import typings.std.Record
import typings.swr.anon.PartialPublicConfiguratioCompare
import typings.swr.distTypesMod.BareFetcher
import typings.swr.distTypesMod.FetcherResponse
import typings.swr.distTypesMod.PublicConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsNormalizeArgsMod {
  
  @JSImport("swr/dist/utils/normalize-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize[KeyType_1, Data](args: js.Array[KeyType_1]): js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ]]
  inline def normalize[KeyType_1, Data](
    args: js.Tuple2[
      KeyType_1, 
      js.UndefOr[
        (js.Function1[
          Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
          FetcherResponse[Data]
        ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null | PartialPublicConfiguratioCompare
      ]
    ]
  ): js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ]]
  inline def normalize[KeyType_1, Data](
    args: js.Tuple3[
      KeyType_1, 
      (js.Function1[
        Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
        FetcherResponse[Data]
      ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
      js.UndefOr[PartialPublicConfiguratioCompare]
    ]
  ): js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    KeyType_1, 
    (js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ]) | (js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]]) | Null, 
    Partial[Partial[PublicConfiguration[Data, Any, BareFetcher[Any]]]]
  ]]
}
