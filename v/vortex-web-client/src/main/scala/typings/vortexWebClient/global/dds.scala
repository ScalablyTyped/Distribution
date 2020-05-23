package typings.vortexWebClient.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typings.vortexWebClient.DDS.EntityQos
import typings.vortexWebClient.DDS.Policy
import typings.vortexWebClient.DDS.Runtime
import typings.vortexWebClient.anon.TypeofDurability
import typings.vortexWebClient.anon.TypeofHistory
import typings.vortexWebClient.anon.TypeofReliability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the core Vortex-Web-Client javascript library. It includes the JavaScript API for DDS. This API allows
  * web applications to share data among them as well as with native DDS applications.
  */
@JSGlobal("dds")
@js.native
object dds extends js.Object {
  @js.native
  class DataCache protected ()
    extends typings.vortexWebClient.DDS.DataCache {
    /**
      * Constructs a `DataCache` with a given `depth`. If the `cache` parameter
      * is present, then the current cache is initialized with this parameter.
      *
      * Provides a way of storing and flexibly accessing the
      * data received through a `DataReader`. A `DataCache` is organized as
      * a map of queues. The depth of the queues is specified at construction
      * time.
      *
      * @param depth - cache size
      * @param cache - cache data structure
      */
    def this(depth: Double, cache: js.Any) = this()
  }
  
  @js.native
  class DataReader protected ()
    extends typings.vortexWebClient.DDS.DataReader {
    /**
      * Creates a `DataReader` for a given topic and a specific in a specific DDS runtime.
      *
      * A `DataReader` allows to read data for a given topic with a specific QoS. A `DataReader`
      * * goes through different states, it is intially disconnected and changes to the connected state
      * when the underlying transport connection is successfully established with the server. At this point
      * a `DataReader` can be explicitely closed or disconnected. A disconnection can happen as the result
      * of a network failure or server failure. Disconnection and reconnections are managed by the runtime.
      *
      * @param runtime - DDS Runtime
      * @param topic - DDS Topic
      * @param qos - DataReader quality of service
      */
    def this(runtime: Runtime, topic: typings.vortexWebClient.DDS.Topic, qos: EntityQos) = this()
    /**
      * Attaches the  listener `l` to this data reader and returns
      * the id associated to the listener.
      * @param l - listener code
      * @returns listener handle
      */
    /* CompleteClass */
    override def addListener(l: js.Function1[/* msg */ js.Any, Unit]): Double = js.native
    /**
      * closes the DataReader
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * removes a listener from this data reader.
      * @param idx - listener id
      */
    /* CompleteClass */
    override def removeListener(idx: Double): Unit = js.native
    /* CompleteClass */
    override def resetStats(): Unit = js.native
  }
  
  @js.native
  class DataWriter protected ()
    extends typings.vortexWebClient.DDS.DataWriter {
    /**
      * Creates a `DataWriter` for a given topic and a specific in a specific DDS runtime
      *
      * defines a DDS data writer. This type
      * is used to write data for a specific topic with a given QoS.
      * A `DataWriter` goes through different states, it is intially disconnected and changes to the connected
      * state when the underlying transport connection is successfully established with the server.
      * At this point a `DataWriter` can be explicitely closed or disconnected. A disconnection can happen
      * as the result of a network failure or server failure. Disconnection and reconnections are managed by the
      * runtime.
      *
      * @param runtime - DDS Runtime
      * @param topic - DDS Topic
      * @param qos - DataWriter quality of service
      */
    def this(runtime: Runtime, topic: typings.vortexWebClient.DDS.Topic, qos: EntityQos) = this()
    /**
      * Closes the DataWriter
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Writes one or more samples.
      * @param ds - data sample
      */
    /* CompleteClass */
    override def write(ds: js.Any*): Unit = js.native
  }
  
  @js.native
  class Topic protected ()
    extends typings.vortexWebClient.DDS.Topic {
    /**
      * Creates a `Topic` in the domain `did`, named `tname`, having `qos` Qos,
      * for the type `ttype` whose registered name is `tregtype`
      * @param {number} did - DDS domain ID
      * @param {string} tname - topic name
      * @param {TopicQos} qos - topic Qos
      * @param {string} ttype - topic type. If not specified, a generic type is used.
      * @param {string} tregtype - topic registered type name. If not specified, 'ttype' is used.
      */
    def this(did: Double, tname: String, qos: EntityQos) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: String) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: String, tregtype: String) = this()
    /**
      * Called when topic gets registered in the runtime
      */
    /* CompleteClass */
    override def onregistered(): Unit = js.native
    /**
      * Called when topic gets unregistered in the runtime
      */
    /* CompleteClass */
    override def onunregistered(): Unit = js.native
  }
  
  var DataReaderQos: EntityQos = js.native
  var DataWriterQos: EntityQos = js.native
  var Durability: TypeofDurability = js.native
  var History: TypeofHistory = js.native
  var Reliability: TypeofReliability = js.native
  var TopicQos: EntityQos = js.native
  var VERSION: String = js.native
  var runtime: typings.vortexWebClient.anon.Runtime = js.native
  def ContentFilter(expr: String): Policy = js.native
  def Partition(policies: String*): Policy = js.native
  def TimeFilter(period: Double): Policy = js.native
  @js.native
  object DataCache
    extends TopLevel[
          Instantiable2[/* depth */ Double, /* cache */ js.Any, typings.vortexWebClient.DDS.DataCache]
        ]
  
  @js.native
  object DataReader
    extends TopLevel[
          Instantiable3[
            /* runtime */ Runtime, 
            /* topic */ typings.vortexWebClient.DDS.Topic, 
            /* qos */ EntityQos, 
            typings.vortexWebClient.DDS.DataReader
          ]
        ]
  
  @js.native
  object DataWriter
    extends TopLevel[
          Instantiable3[
            /* runtime */ Runtime, 
            /* topic */ typings.vortexWebClient.DDS.Topic, 
            /* qos */ EntityQos, 
            typings.vortexWebClient.DDS.DataWriter
          ]
        ]
  
  @js.native
  object Topic
    extends TopLevel[
          Instantiable5[
            /* did */ Double, 
            /* tname */ String, 
            /* qos */ EntityQos, 
            js.UndefOr[/* ttype */ String], 
            js.UndefOr[/* tregtype */ String], 
            typings.vortexWebClient.DDS.Topic
          ]
        ]
  
}

