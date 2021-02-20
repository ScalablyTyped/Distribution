package typings.vegaLite

import typings.vegaLite.anon.Reason
import typings.vegaLite.anon.ScaleDataRefsortVgSortFie
import typings.vegaLite.anon.ScaleMultiDataRefsortVgSo
import typings.vegaLite.anon.ScaleMultiFieldsRefsortVg
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.modelMod.Model
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.splitMod.Explicit
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaSchemaMod.VgDomain
import typings.vegaLite.vegaSchemaMod.VgNonUnionDomain
import typings.vegaTypings.scaleMod.SortField
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "assembleDomain")
  @js.native
  def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleDataRefsortVgSortFie | ScaleMultiDataRefsortVgSo | ScaleMultiFieldsRefsortVg | (js.Array[String | Double | Boolean | SignalRef]) = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "canUseUnaggregatedDomain")
  @js.native
  def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "domainSort")
  @js.native
  def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "getFieldFromDomain")
  @js.native
  def getFieldFromDomain(domain: VgDomain): String = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "mergeDomains")
  @js.native
  def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "parseDomainForChannel")
  @js.native
  def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/domain", "parseScaleDomain")
  @js.native
  def parseScaleDomain(model: Model): Unit = js.native
}
