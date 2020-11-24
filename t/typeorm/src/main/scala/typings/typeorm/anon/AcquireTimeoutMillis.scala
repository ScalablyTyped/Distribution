package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquireTimeoutMillis extends js.Object {
  
  /**
    * Max milliseconds an acquire call will wait for a resource before timing out. (default no limit), if supplied should non-zero positive integer.
    */
  val acquireTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Should the pool start creating resources etc once the constructor is called, (default true)
    */
  val autostart: js.UndefOr[Double] = js.native
  
  val errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * How often to run eviction checks. Default: 0 (does not run).
    */
  val evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  
  /**
    * If true the oldest resources will be first to be allocated. If false the most recently released resources will
    * be the first to be allocated. This in effect turns the pool's behaviour from a queue into a stack. boolean,
    * (default true)
    */
  val fifo: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum amount of time that an object may sit idle in the pool before it is eligible for eviction due
    * to idle time. Supercedes softIdleTimeoutMillis Default: 30000
    */
  val idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of resources to create at any given time. (default=1)
    */
  val max: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of queued requests allowed, additional acquire calls will be callback with an err in a future
    * cycle of the event loop.
    */
  val maxWaitingClients: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of resources to keep in pool at any given time. If this is set >= max, the pool will silently
    * set the min to equal max. (default=0)
    */
  val min: js.UndefOr[Double] = js.native
  
  /**
    * Number of resources to check each eviction run. Default: 3.
    */
  val numTestsPerRun: js.UndefOr[Double] = js.native
  
  /**
    * Int between 1 and x - if set, borrowers can specify their relative priority in the queue if no resources
    * are available. see example. (default 1)
    */
  val priorityRange: js.UndefOr[Double] = js.native
  
  /**
    * Amount of time an object may sit idle in the pool before it is eligible for eviction by the idle object
    * evictor (if any), with the extra condition that at least "min idle" object instances remain in the pool.
    * Default -1 (nothing can get evicted)
    */
  val softIdleTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Should the pool validate resources before giving them to clients. Requires that either factory.validate or
    * factory.validateAsync to be specified
    */
  val testOnBorrow: js.UndefOr[Boolean] = js.native
}
object AcquireTimeoutMillis {
  
  @scala.inline
  def apply(): AcquireTimeoutMillis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquireTimeoutMillis]
  }
  
  @scala.inline
  implicit class AcquireTimeoutMillisOps[Self <: AcquireTimeoutMillis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcquireTimeoutMillis(value: Double): Self = this.set("acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireTimeoutMillis: Self = this.set("acquireTimeoutMillis", js.undefined)
    
    @scala.inline
    def setAutostart(value: Double): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* err */ js.Any => _): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = this.set("evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvictionRunIntervalMillis: Self = this.set("evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setFifo(value: Boolean): Self = this.set("fifo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFifo: Self = this.set("fifo", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeoutMillis: Self = this.set("idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxWaitingClients(value: Double): Self = this.set("maxWaitingClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWaitingClients: Self = this.set("maxWaitingClients", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNumTestsPerRun(value: Double): Self = this.set("numTestsPerRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTestsPerRun: Self = this.set("numTestsPerRun", js.undefined)
    
    @scala.inline
    def setPriorityRange(value: Double): Self = this.set("priorityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorityRange: Self = this.set("priorityRange", js.undefined)
    
    @scala.inline
    def setSoftIdleTimeoutMillis(value: Double): Self = this.set("softIdleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftIdleTimeoutMillis: Self = this.set("softIdleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = this.set("testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestOnBorrow: Self = this.set("testOnBorrow", js.undefined)
  }
}
