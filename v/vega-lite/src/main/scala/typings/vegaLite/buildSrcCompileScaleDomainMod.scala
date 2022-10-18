package typings.vegaLite

import typings.vegaLite.anon.Reason
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.ScaleChannel
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcCompileSplitMod.Explicit
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcScaleMod.ScaleType
import typings.vegaLite.buildSrcVegaDotschemaMod.VgDomain
import typings.vegaLite.buildSrcVegaDotschemaMod.VgNonUnionDomain
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.typesSpecScaleMod.ScaleData
import typings.vegaTypings.typesSpecScaleMod.SortField
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScaleDomainMod {
  
  @JSImport("vega-lite/build/src/compile/scale/domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleDomain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef])]
  
  inline def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = (^.asInstanceOf[js.Dynamic].applyDynamic("canUseUnaggregatedDomain")(fieldDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Reason]
  
  inline def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = (^.asInstanceOf[js.Dynamic].applyDynamic("domainSort")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true` | SortField]]
  
  inline def getFieldFromDomain(domain: VgDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDomains")(domains.asInstanceOf[js.Any]).asInstanceOf[VgDomain]
  
  inline def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDomainForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Explicit[js.Array[VgNonUnionDomain]]]
  
  inline def parseScaleDomain(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleDomain")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
