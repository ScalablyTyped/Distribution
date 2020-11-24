package typings.vortexWebClient.global

import org.scalablytyped.runtime.TopLevel
import typings.vortexWebClient.DDS.EntityQos
import typings.vortexWebClient.DDS.Policy
import typings.vortexWebClient.DDS.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DDS")
@js.native
object DDS_ extends js.Object {
  
  def ContentFilter(expr: String): Policy = js.native
  
  def Partition(policies: String*): Policy = js.native
  
  def TimeFilter(period: Double): Policy = js.native
  
  var VERSION: String = js.native
  
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
  }
  
  @js.native
  class DataReaderQos protected () extends EntityQos {
    /**
      * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
      *
      * @param policies - list of policies for the Qos entity
      */
    def this(policies: Policy*) = this()
  }
  @js.native
  object DataReaderQos extends TopLevel[EntityQos]
  
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
  }
  
  @js.native
  class DataWriterQos protected () extends EntityQos {
    /**
      * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
      *
      * @param policies - list of policies for the Qos entity
      */
    def this(policies: Policy*) = this()
  }
  @js.native
  object DataWriterQos extends TopLevel[EntityQos]
  
  @js.native
  class Durability () extends Policy
  /* static members */
  @js.native
  object Durability extends js.Object {
    
    /**
      * Persistent - Persistent durability policy
      */
    var Persistent: js.Any = js.native
    
    /**
      * Transient - Transient durability policy
      */
    var Transient: js.Any = js.native
    
    /**
      * TransientLocal - TransientLocal durability policy
      */
    var TransientLocal: js.Any = js.native
    
    /**
      * Volatile - Volatile durability policy
      */
    var Volatile: js.Any = js.native
  }
  
  @js.native
  object DurabilityKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS.DurabilityKind with Double] = js.native
    
    /* 3 */ val Persistent: typings.vortexWebClient.DDS.DurabilityKind.Persistent with Double = js.native
    
    /* 2 */ val Transient: typings.vortexWebClient.DDS.DurabilityKind.Transient with Double = js.native
    
    /* 1 */ val TransientLocal: typings.vortexWebClient.DDS.DurabilityKind.TransientLocal with Double = js.native
    
    /* 0 */ val Volatile: typings.vortexWebClient.DDS.DurabilityKind.Volatile with Double = js.native
  }
  
  @js.native
  class History () extends Policy
  /* static members */
  @js.native
  object History extends js.Object {
    
    /**
      * KeepAll - KEEP_ALL qos policy
      */
    var KeepAll: js.Any = js.native
    
    /**
      * KeepLast - KEEP_LAST qos policy
      */
    var KeepLast: js.Any = js.native
  }
  
  @js.native
  object HistoryKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS.HistoryKind with Double] = js.native
    
    /* 0 */ val KeepAll: typings.vortexWebClient.DDS.HistoryKind.KeepAll with Double = js.native
    
    /* 1 */ val KeepLast: typings.vortexWebClient.DDS.HistoryKind.KeepLast with Double = js.native
  }
  
  @js.native
  class Reliability () extends Policy
  /* static members */
  @js.native
  object Reliability extends js.Object {
    
    /**
      * BestEffort - 'BestEffort' reliability policy
      */
    var BestEffort: js.Any = js.native
    
    /**
      * Reliable - 'Reliable' reliability policy
      */
    var Reliable: js.Any = js.native
  }
  
  @js.native
  object ReliabilityKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS.ReliabilityKind with Double] = js.native
    
    /* 1 */ val BestEffort: typings.vortexWebClient.DDS.ReliabilityKind.BestEffort with Double = js.native
    
    /* 0 */ val Reliable: typings.vortexWebClient.DDS.ReliabilityKind.Reliable with Double = js.native
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
    def this(did: Double, tname: String, qos: EntityQos, ttype: js.UndefOr[scala.Nothing], tregtype: String) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: String, tregtype: String) = this()
  }
  
  @js.native
  class TopicQos protected () extends EntityQos {
    /**
      * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
      *
      * @param policies - list of policies for the Qos entity
      */
    def this(policies: Policy*) = this()
  }
  @js.native
  object TopicQos extends TopLevel[EntityQos]
  
  @js.native
  object runtime extends js.Object {
    
    var Runtime: typings.vortexWebClient.DDS.Runtime = js.native
  }
}
