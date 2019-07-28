package typings.vortexDashWebDashClient

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import typings.vortexDashWebDashClient.DDSNs.EntityQos
import typings.vortexDashWebDashClient.DDSNs.Policy
import typings.vortexDashWebDashClient.DDSNs.Runtime
import typings.vortexDashWebDashClient.DDSNs.Topic
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
  var DataCache: Instantiable2[
    /* depth */ Double, 
    /* cache */ js.Any, 
    typings.vortexDashWebDashClient.DDSNs.DataCache
  ] = js.native
  var DataReader: Instantiable3[
    /* runtime */ Runtime, 
    /* topic */ Topic, 
    /* qos */ EntityQos, 
    typings.vortexDashWebDashClient.DDSNs.DataReader
  ] = js.native
  var DataReaderQos: EntityQos = js.native
  var DataWriter: Instantiable3[
    /* runtime */ Runtime, 
    /* topic */ Topic, 
    /* qos */ EntityQos, 
    typings.vortexDashWebDashClient.DDSNs.DataWriter
  ] = js.native
  var DataWriterQos: EntityQos = js.native
  var Durability: TypeofClassDurability = js.native
  var History: TypeofClassHistory = js.native
  var Reliability: TypeofClassReliability = js.native
  var Topic: Instantiable5[
    /* did */ Double, 
    /* tname */ String, 
    /* qos */ EntityQos, 
    js.UndefOr[/* ttype */ String], 
    js.UndefOr[/* tregtype */ String], 
    typings.vortexDashWebDashClient.DDSNs.Topic
  ] = js.native
  var TopicQos: EntityQos = js.native
  var VERSION: String = js.native
  var runtime: Anon_Runtime = js.native
  def ContentFilter(expr: String): Policy = js.native
  def Partition(policies: String*): Policy = js.native
  def TimeFilter(period: Double): Policy = js.native
}

