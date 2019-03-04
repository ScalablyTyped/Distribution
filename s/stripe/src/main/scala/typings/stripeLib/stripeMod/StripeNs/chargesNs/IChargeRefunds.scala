package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeRefunds
  extends stripeLib.stripeMod.StripeNs.resourcesNs.ChargeRefunds
     with stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]

object IChargeRefunds {
  @scala.inline
  def apply(
    data: js.Array[stripeLib.stripeMod.StripeNs.refundsNs.IRefund],
    has_more: scala.Boolean,
    `object`: java.lang.String,
    url: java.lang.String,
    create: (js.Function3[
      /* data */ stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions, 
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function2[
      /* data */ stripeLib.stripeMod.StripeNs.refundsNs.IRefundCreationOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function2[
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function1[
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) = null,
    list: (js.Function3[
      /* data */ stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions, 
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[
          stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
        ]
      ], 
      js.Promise[
        stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ]
    ]) with (js.Function2[
      /* data */ stripeLib.stripeMod.StripeNs.refundsNs.IRefundListOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[
          stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
        ]
      ], 
      js.Promise[
        stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ]
    ]) with (js.Function2[
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[
          stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
        ]
      ], 
      js.Promise[
        stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ]
    ]) with (js.Function1[
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[
          stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
        ]
      ], 
      js.Promise[
        stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ]
    ]) = null,
    retrieve: (js.Function4[
      /* id */ java.lang.String, 
      /* data */ stripeLib.stripeMod.StripeNs.IDataOptions, 
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function3[
      /* id */ java.lang.String, 
      /* data */ stripeLib.stripeMod.StripeNs.IDataOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function3[
      /* id */ java.lang.String, 
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function2[
      /* id */ java.lang.String, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) = null,
    total_count: scala.Int | scala.Double = null,
    update: (js.Function4[
      /* id */ java.lang.String, 
      /* data */ stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata, 
      /* options */ stripeLib.stripeMod.StripeNs.HeaderOptions, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) with (js.Function3[
      /* id */ java.lang.String, 
      /* data */ stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata, 
      /* response */ js.UndefOr[
        stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
      ], 
      js.Promise[stripeLib.stripeMod.StripeNs.refundsNs.IRefund]
    ]) = null
  ): IChargeRefunds = {
    val __obj = js.Dynamic.literal(data = data, has_more = has_more, url = url)
    __obj.updateDynamic("object")(`object`)
    if (create != null) __obj.updateDynamic("create")(create)
    if (list != null) __obj.updateDynamic("list")(list)
    if (retrieve != null) __obj.updateDynamic("retrieve")(retrieve)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[IChargeRefunds]
  }
}

