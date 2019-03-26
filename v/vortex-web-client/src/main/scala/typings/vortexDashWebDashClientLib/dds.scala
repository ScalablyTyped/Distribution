package typings
package vortexDashWebDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the core Vortex-Web-Client javascript library. It includes the JavaScript API for DDS. This API allows
  * web applications to share data among them as well as with native DDS applications.
  */
/* Extracted nested Instantiables into classes in ddsNs */
@JSGlobal("dds")
@js.native
object dds extends js.Object {
  var DataCache: org.scalablytyped.runtime.Instantiable2[
    /* depth */ scala.Double, 
    /* cache */ js.Any, 
    vortexDashWebDashClientLib.DDSNs.DataCache
  ] = js.native
  var DataReader: org.scalablytyped.runtime.Instantiable3[
    /* runtime */ vortexDashWebDashClientLib.DDSNs.Runtime, 
    /* topic */ vortexDashWebDashClientLib.DDSNs.Topic, 
    /* qos */ vortexDashWebDashClientLib.DDSNs.EntityQos, 
    vortexDashWebDashClientLib.DDSNs.DataReader
  ] = js.native
  var DataReaderQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var DataWriter: org.scalablytyped.runtime.Instantiable3[
    /* runtime */ vortexDashWebDashClientLib.DDSNs.Runtime, 
    /* topic */ vortexDashWebDashClientLib.DDSNs.Topic, 
    /* qos */ vortexDashWebDashClientLib.DDSNs.EntityQos, 
    vortexDashWebDashClientLib.DDSNs.DataWriter
  ] = js.native
  var DataWriterQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var Durability: vortexDashWebDashClientLib.Anon_Persistent = js.native
  var History: vortexDashWebDashClientLib.Anon_KeepAll = js.native
  var Reliability: vortexDashWebDashClientLib.Anon_BestEffort = js.native
  var Topic: org.scalablytyped.runtime.Instantiable5[
    /* did */ scala.Double, 
    /* tname */ java.lang.String, 
    /* qos */ vortexDashWebDashClientLib.DDSNs.EntityQos, 
    /* ttype */ js.UndefOr[/* ttype */ java.lang.String], 
    /* tregtype */ js.UndefOr[/* tregtype */ java.lang.String], 
    vortexDashWebDashClientLib.DDSNs.Topic
  ] = js.native
  var TopicQos: vortexDashWebDashClientLib.DDSNs.EntityQos = js.native
  var VERSION: java.lang.String = js.native
  var runtime: vortexDashWebDashClientLib.Anon_Runtime = js.native
  def ContentFilter(expr: java.lang.String): vortexDashWebDashClientLib.DDSNs.Policy = js.native
  def Partition(policies: java.lang.String*): vortexDashWebDashClientLib.DDSNs.Policy = js.native
  def TimeFilter(period: scala.Double): vortexDashWebDashClientLib.DDSNs.Policy = js.native
}

