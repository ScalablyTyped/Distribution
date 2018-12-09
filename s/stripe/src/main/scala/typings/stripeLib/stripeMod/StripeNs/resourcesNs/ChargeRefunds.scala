package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChargeRefunds
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  /**
               * When you create a new refund, you must specify a charge to create it on.
               *
               * Creating a new refund will refund a charge that has previously been created but not yet refunded.
               * Funds will be refunded to the credit or debit card that was originally charged.
               * The fees you were originally charged are also refunded.
               *
               * You can optionally refund only part of a charge.
               * You can do so as many times as you wish until the entire charge has been refunded.
               *
               * Once entirely refunded, a charge can't be refunded again.
               * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
               */
  var create: js.UndefOr[
    (js.Function3[
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
    ])
  ] = js.undefined
  /**
               * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
               * with the most recent refunds appearing first.
               * For convenience, the 10 most recent refunds are always available by default on the charge object.
               */
  var list: js.UndefOr[
    (js.Function3[
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
    ])
  ] = js.undefined
  /**
               * Retrieves the details of an existing refund.
               */
  var retrieve: js.UndefOr[
    (js.Function4[
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
    ])
  ] = js.undefined
  /**
               * Updates the specified refund by setting the values of the parameters passed.
               * Any parameters not provided will be left unchanged.
               *
               * This request only accepts metadata as an argument.
               */
  var update: js.UndefOr[
    (js.Function4[
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
    ])
  ] = js.undefined
}

