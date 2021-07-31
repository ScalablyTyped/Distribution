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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("vega-lite/build/src/compile/scale/domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleDataRefsortVgSortFie | ScaleMultiDataRefsortVgSo | ScaleMultiFieldsRefsortVg | (js.Array[String | Double | Boolean | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleDomain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ScaleDataRefsortVgSortFie | ScaleMultiDataRefsortVgSo | ScaleMultiFieldsRefsortVg | (js.Array[String | Double | Boolean | SignalRef])]
  
  @scala.inline
  def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = (^.asInstanceOf[js.Dynamic].applyDynamic("canUseUnaggregatedDomain")(fieldDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Reason]
  
  @scala.inline
  def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = (^.asInstanceOf[js.Dynamic].applyDynamic("domainSort")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true` | SortField]]
  
  @scala.inline
  def getFieldFromDomain(domain: VgDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDomains")(domains.asInstanceOf[js.Any]).asInstanceOf[VgDomain]
  
  @scala.inline
  def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDomainForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Explicit[js.Array[VgNonUnionDomain]]]
  
  @scala.inline
  def parseScaleDomain(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleDomain")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
