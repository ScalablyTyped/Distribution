package typings.vortexWebClient

import typings.vortexWebClient.DDS_.EntityQos
import typings.vortexWebClient.DDS_.Policy
import typings.vortexWebClient.DDS_.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DDS_ {
    
    @JSGlobal("DDS")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ContentFilter(expr: String): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("ContentFilter")(expr.asInstanceOf[js.Any]).asInstanceOf[Policy]
    
    @JSGlobal("DDS.DataCache")
    @js.native
    open class DataCache protected ()
      extends StObject
         with typings.vortexWebClient.DDS_.DataCache {
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
      def this(depth: Double, cache: Any) = this()
    }
    
    @JSGlobal("DDS.DataReader")
    @js.native
    open class DataReader protected ()
      extends StObject
         with typings.vortexWebClient.DDS_.DataReader {
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
      def this(runtime: Runtime, topic: typings.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
      
      /**
        * Attaches the  listener `l` to this data reader and returns
        * the id associated to the listener.
        * @param l - listener code
        * @returns listener handle
        */
      /* CompleteClass */
      override def addListener(l: js.Function1[/* msg */ Any, Unit]): Double = js.native
      
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.DataReaderQos")
    @js.native
    open class DataReaderQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.DataReaderQos")
    @js.native
    def DataReaderQos: EntityQos = js.native
    inline def DataReaderQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataReaderQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.DataWriter")
    @js.native
    open class DataWriter protected ()
      extends StObject
         with typings.vortexWebClient.DDS_.DataWriter {
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
      def this(runtime: Runtime, topic: typings.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
      
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
      override def write(ds: Any*): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.DataWriterQos")
    @js.native
    open class DataWriterQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.DataWriterQos")
    @js.native
    def DataWriterQos: EntityQos = js.native
    inline def DataWriterQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataWriterQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.Durability")
    @js.native
    open class Durability ()
      extends StObject
         with Policy
    /* static members */
    object Durability {
      
      @JSGlobal("DDS.Durability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Persistent - Persistent durability policy
        */
      @JSGlobal("DDS.Durability.Persistent")
      @js.native
      def Persistent: Any = js.native
      inline def Persistent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(x.asInstanceOf[js.Any])
      
      /**
        * Transient - Transient durability policy
        */
      @JSGlobal("DDS.Durability.Transient")
      @js.native
      def Transient: Any = js.native
      
      /**
        * TransientLocal - TransientLocal durability policy
        */
      @JSGlobal("DDS.Durability.TransientLocal")
      @js.native
      def TransientLocal: Any = js.native
      inline def TransientLocal_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransientLocal")(x.asInstanceOf[js.Any])
      
      inline def Transient_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transient")(x.asInstanceOf[js.Any])
      
      /**
        * Volatile - Volatile durability policy
        */
      @JSGlobal("DDS.Durability.Volatile")
      @js.native
      def Volatile: Any = js.native
      inline def Volatile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Volatile")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.DurabilityKind")
    @js.native
    object DurabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS_.DurabilityKind & Double] = js.native
      
      /* 3 */ val Persistent: typings.vortexWebClient.DDS_.DurabilityKind.Persistent & Double = js.native
      
      /* 2 */ val Transient: typings.vortexWebClient.DDS_.DurabilityKind.Transient & Double = js.native
      
      /* 1 */ val TransientLocal: typings.vortexWebClient.DDS_.DurabilityKind.TransientLocal & Double = js.native
      
      /* 0 */ val Volatile: typings.vortexWebClient.DDS_.DurabilityKind.Volatile & Double = js.native
    }
    
    @JSGlobal("DDS.History")
    @js.native
    open class History ()
      extends StObject
         with Policy
    /* static members */
    object History {
      
      @JSGlobal("DDS.History")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * KeepAll - KEEP_ALL qos policy
        */
      @JSGlobal("DDS.History.KeepAll")
      @js.native
      def KeepAll: Any = js.native
      inline def KeepAll_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepAll")(x.asInstanceOf[js.Any])
      
      /**
        * KeepLast - KEEP_LAST qos policy
        */
      @JSGlobal("DDS.History.KeepLast")
      @js.native
      def KeepLast: Any = js.native
      inline def KeepLast_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepLast")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.HistoryKind")
    @js.native
    object HistoryKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS_.HistoryKind & Double] = js.native
      
      /* 0 */ val KeepAll: typings.vortexWebClient.DDS_.HistoryKind.KeepAll & Double = js.native
      
      /* 1 */ val KeepLast: typings.vortexWebClient.DDS_.HistoryKind.KeepLast & Double = js.native
    }
    
    inline def Partition(policies: String*): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("Partition")(policies.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Policy]
    
    @JSGlobal("DDS.Reliability")
    @js.native
    open class Reliability ()
      extends StObject
         with Policy
    /* static members */
    object Reliability {
      
      @JSGlobal("DDS.Reliability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * BestEffort - 'BestEffort' reliability policy
        */
      @JSGlobal("DDS.Reliability.BestEffort")
      @js.native
      def BestEffort: Any = js.native
      inline def BestEffort_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BestEffort")(x.asInstanceOf[js.Any])
      
      /**
        * Reliable - 'Reliable' reliability policy
        */
      @JSGlobal("DDS.Reliability.Reliable")
      @js.native
      def Reliable: Any = js.native
      inline def Reliable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reliable")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.ReliabilityKind")
    @js.native
    object ReliabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.DDS_.ReliabilityKind & Double] = js.native
      
      /* 1 */ val BestEffort: typings.vortexWebClient.DDS_.ReliabilityKind.BestEffort & Double = js.native
      
      /* 0 */ val Reliable: typings.vortexWebClient.DDS_.ReliabilityKind.Reliable & Double = js.native
    }
    
    inline def TimeFilter(period: Double): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeFilter")(period.asInstanceOf[js.Any]).asInstanceOf[Policy]
    
    @JSGlobal("DDS.Topic")
    @js.native
    open class Topic protected ()
      extends StObject
         with typings.vortexWebClient.DDS_.Topic {
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
      def this(did: Double, tname: String, qos: EntityQos, ttype: Unit, tregtype: String) = this()
      
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.TopicQos")
    @js.native
    open class TopicQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.TopicQos")
    @js.native
    def TopicQos: EntityQos = js.native
    inline def TopicQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopicQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    object runtime {
      
      @JSGlobal("DDS.runtime")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("DDS.runtime.Runtime")
      @js.native
      def Runtime: typings.vortexWebClient.DDS_.Runtime = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("DDS.runtime.Runtime")
      @js.native
      /**
        * Constructs a DDS Runtime object
        *
        * maintains the connection with the server, re-establish the connection
        * if dropped and mediates the `DataReader` and `DataWriter` communication.
        */
      open class RuntimeCls ()
        extends StObject
           with Runtime
      
      inline def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    }
  }
  
  /* was `typeof DDS` */
  object dds {
    
    @JSGlobal("dds")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ContentFilter(expr: String): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("ContentFilter")(expr.asInstanceOf[js.Any]).asInstanceOf[Policy]
    
    @JSGlobal("dds.DataCache")
    @js.native
    open class DataCache protected ()
      extends StObject
         with typings.vortexWebClient.dds.DataCache {
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
      def this(depth: Double, cache: Any) = this()
    }
    
    @JSGlobal("dds.DataReader")
    @js.native
    open class DataReader protected ()
      extends StObject
         with typings.vortexWebClient.dds.DataReader {
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
      def this(runtime: Runtime, topic: typings.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
      
      /**
        * Attaches the  listener `l` to this data reader and returns
        * the id associated to the listener.
        * @param l - listener code
        * @returns listener handle
        */
      /* CompleteClass */
      override def addListener(l: js.Function1[/* msg */ Any, Unit]): Double = js.native
      
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.DataReaderQos")
    @js.native
    open class DataReaderQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.DataReaderQos")
    @js.native
    def DataReaderQos: EntityQos = js.native
    inline def DataReaderQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataReaderQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.DataWriter")
    @js.native
    open class DataWriter protected ()
      extends StObject
         with typings.vortexWebClient.dds.DataWriter {
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
      def this(runtime: Runtime, topic: typings.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
      
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
      override def write(ds: Any*): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.DataWriterQos")
    @js.native
    open class DataWriterQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.DataWriterQos")
    @js.native
    def DataWriterQos: EntityQos = js.native
    inline def DataWriterQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataWriterQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.Durability")
    @js.native
    open class Durability ()
      extends StObject
         with Policy
    /* static members */
    object Durability {
      
      @JSGlobal("dds.Durability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Persistent - Persistent durability policy
        */
      @JSGlobal("dds.Durability.Persistent")
      @js.native
      def Persistent: Any = js.native
      inline def Persistent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(x.asInstanceOf[js.Any])
      
      /**
        * Transient - Transient durability policy
        */
      @JSGlobal("dds.Durability.Transient")
      @js.native
      def Transient: Any = js.native
      
      /**
        * TransientLocal - TransientLocal durability policy
        */
      @JSGlobal("dds.Durability.TransientLocal")
      @js.native
      def TransientLocal: Any = js.native
      inline def TransientLocal_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransientLocal")(x.asInstanceOf[js.Any])
      
      inline def Transient_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transient")(x.asInstanceOf[js.Any])
      
      /**
        * Volatile - Volatile durability policy
        */
      @JSGlobal("dds.Durability.Volatile")
      @js.native
      def Volatile: Any = js.native
      inline def Volatile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Volatile")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.DurabilityKind")
    @js.native
    object DurabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.dds.DurabilityKind & Double] = js.native
      
      /* 3 */ val Persistent: typings.vortexWebClient.dds.DurabilityKind.Persistent & Double = js.native
      
      /* 2 */ val Transient: typings.vortexWebClient.dds.DurabilityKind.Transient & Double = js.native
      
      /* 1 */ val TransientLocal: typings.vortexWebClient.dds.DurabilityKind.TransientLocal & Double = js.native
      
      /* 0 */ val Volatile: typings.vortexWebClient.dds.DurabilityKind.Volatile & Double = js.native
    }
    
    @JSGlobal("dds.History")
    @js.native
    open class History ()
      extends StObject
         with Policy
    /* static members */
    object History {
      
      @JSGlobal("dds.History")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * KeepAll - KEEP_ALL qos policy
        */
      @JSGlobal("dds.History.KeepAll")
      @js.native
      def KeepAll: Any = js.native
      inline def KeepAll_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepAll")(x.asInstanceOf[js.Any])
      
      /**
        * KeepLast - KEEP_LAST qos policy
        */
      @JSGlobal("dds.History.KeepLast")
      @js.native
      def KeepLast: Any = js.native
      inline def KeepLast_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepLast")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.HistoryKind")
    @js.native
    object HistoryKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.dds.HistoryKind & Double] = js.native
      
      /* 0 */ val KeepAll: typings.vortexWebClient.dds.HistoryKind.KeepAll & Double = js.native
      
      /* 1 */ val KeepLast: typings.vortexWebClient.dds.HistoryKind.KeepLast & Double = js.native
    }
    
    inline def Partition(policies: String*): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("Partition")(policies.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Policy]
    
    @JSGlobal("dds.Reliability")
    @js.native
    open class Reliability ()
      extends StObject
         with Policy
    /* static members */
    object Reliability {
      
      @JSGlobal("dds.Reliability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * BestEffort - 'BestEffort' reliability policy
        */
      @JSGlobal("dds.Reliability.BestEffort")
      @js.native
      def BestEffort: Any = js.native
      inline def BestEffort_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BestEffort")(x.asInstanceOf[js.Any])
      
      /**
        * Reliable - 'Reliable' reliability policy
        */
      @JSGlobal("dds.Reliability.Reliable")
      @js.native
      def Reliable: Any = js.native
      inline def Reliable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reliable")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.ReliabilityKind")
    @js.native
    object ReliabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.vortexWebClient.dds.ReliabilityKind & Double] = js.native
      
      /* 1 */ val BestEffort: typings.vortexWebClient.dds.ReliabilityKind.BestEffort & Double = js.native
      
      /* 0 */ val Reliable: typings.vortexWebClient.dds.ReliabilityKind.Reliable & Double = js.native
    }
    
    inline def TimeFilter(period: Double): Policy = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeFilter")(period.asInstanceOf[js.Any]).asInstanceOf[Policy]
    
    @JSGlobal("dds.Topic")
    @js.native
    open class Topic protected ()
      extends StObject
         with typings.vortexWebClient.dds.Topic {
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
      def this(did: Double, tname: String, qos: EntityQos, ttype: Unit, tregtype: String) = this()
      
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.TopicQos")
    @js.native
    open class TopicQos protected ()
      extends StObject
         with EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.TopicQos")
    @js.native
    def TopicQos: EntityQos = js.native
    inline def TopicQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopicQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    object runtime {
      
      @JSGlobal("dds.runtime")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("dds.runtime.Runtime")
      @js.native
      def Runtime: typings.vortexWebClient.DDS_.Runtime = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("dds.runtime.Runtime")
      @js.native
      /**
        * Constructs a DDS Runtime object
        *
        * maintains the connection with the server, re-establish the connection
        * if dropped and mediates the `DataReader` and `DataWriter` communication.
        */
      open class RuntimeCls ()
        extends StObject
           with Runtime
      
      inline def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    }
  }
}
